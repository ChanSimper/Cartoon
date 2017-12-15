package txtreaderlib.tasks;

import java.io.File;

import txtreaderlib.bean.TxtFileMsg;
import txtreaderlib.bean.TxtMsg;
import txtreaderlib.interfaces.ILoadListener;
import txtreaderlib.interfaces.ITxtTask;
import txtreaderlib.main.TxtReaderContext;
import txtreaderlib.utils.ELogger;
import txtreaderlib.utils.FileUtil;


/**
 * created by ： bifan-wei
 */

public class TxtFileLoader {

    private String tag = "TxtFileLoader";

    public void load(String filePath, TxtReaderContext readerContext, ILoadListener loadListener) {
        load(filePath, null, readerContext, loadListener);
    }

    public void load(String filePath, String fileName, TxtReaderContext readerContext, ILoadListener loadListener) {
        if (!FileUtil.FileExist(filePath)) {
            loadListener.onFail(TxtMsg.FileNoExist);
            return;
        }
        initFile(filePath, fileName, readerContext);
        ELogger.log(tag, "initFile done");
        ITxtTask txtTask = new FileDataLoadTask();
        txtTask.Run(loadListener, readerContext);

    }

    private void initFile(String filePath, String fileName, TxtReaderContext readerContext) {
        File file = new File(filePath);
        TxtFileMsg fileMsg = new TxtFileMsg();
        fileMsg.FileSize = file.getTotalSpace();
        fileMsg.FilePath = filePath;
        fileMsg.FileCode = FileUtil.getCharset(filePath);

        fileMsg.CurrentParagraphIndex = 0;
        fileMsg.CurrentParagraphIndex = 0;
        fileMsg.PreParagraphIndex = 0;
        fileMsg.PreCharIndex = 0;
        if (fileName == null) {
            fileName = FileUtil.getDefaultNameFromFilePath(filePath);
        }
        fileMsg.FileName = fileName;
        readerContext.setFileMsg(fileMsg);
    }
}
