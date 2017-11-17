package com.chrissen.cartoon.dao.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOK".
*/
public class BookDao extends AbstractDao<Book, Long> {

    public static final String TABLENAME = "BOOK";

    /**
     * Properties of entity Book.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserEmail = new Property(1, String.class, "userEmail", false, "USER_EMAIL");
        public final static Property BookName = new Property(2, String.class, "bookName", false, "BOOK_NAME");
        public final static Property ChapterId = new Property(3, String.class, "chapterId", false, "CHAPTER_ID");
        public final static Property ChapterName = new Property(4, String.class, "chapterName", false, "CHAPTER_NAME");
        public final static Property ImageId = new Property(5, String.class, "imageId", false, "IMAGE_ID");
        public final static Property Type = new Property(6, String.class, "type", false, "TYPE");
        public final static Property Area = new Property(7, String.class, "area", false, "AREA");
        public final static Property Finish = new Property(8, boolean.class, "finish", false, "FINISH");
        public final static Property LastUpdate = new Property(9, String.class, "lastUpdate", false, "LAST_UPDATE");
        public final static Property AddedTime = new Property(10, long.class, "addedTime", false, "ADDED_TIME");
        public final static Property UpdatedTime = new Property(11, long.class, "updatedTime", false, "UPDATED_TIME");
        public final static Property Comment = new Property(12, String.class, "comment", false, "COMMENT");
    }


    public BookDao(DaoConfig config) {
        super(config);
    }
    
    public BookDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOK\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"USER_EMAIL\" TEXT," + // 1: userEmail
                "\"BOOK_NAME\" TEXT," + // 2: bookName
                "\"CHAPTER_ID\" TEXT," + // 3: chapterId
                "\"CHAPTER_NAME\" TEXT," + // 4: chapterName
                "\"IMAGE_ID\" TEXT," + // 5: imageId
                "\"TYPE\" TEXT," + // 6: type
                "\"AREA\" TEXT," + // 7: area
                "\"FINISH\" INTEGER NOT NULL ," + // 8: finish
                "\"LAST_UPDATE\" TEXT," + // 9: lastUpdate
                "\"ADDED_TIME\" INTEGER NOT NULL ," + // 10: addedTime
                "\"UPDATED_TIME\" INTEGER NOT NULL ," + // 11: updatedTime
                "\"COMMENT\" TEXT);"); // 12: comment
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Book entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userEmail = entity.getUserEmail();
        if (userEmail != null) {
            stmt.bindString(2, userEmail);
        }
 
        String bookName = entity.getBookName();
        if (bookName != null) {
            stmt.bindString(3, bookName);
        }
 
        String chapterId = entity.getChapterId();
        if (chapterId != null) {
            stmt.bindString(4, chapterId);
        }
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(5, chapterName);
        }
 
        String imageId = entity.getImageId();
        if (imageId != null) {
            stmt.bindString(6, imageId);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(8, area);
        }
        stmt.bindLong(9, entity.getFinish() ? 1L: 0L);
 
        String lastUpdate = entity.getLastUpdate();
        if (lastUpdate != null) {
            stmt.bindString(10, lastUpdate);
        }
        stmt.bindLong(11, entity.getAddedTime());
        stmt.bindLong(12, entity.getUpdatedTime());
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(13, comment);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Book entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String userEmail = entity.getUserEmail();
        if (userEmail != null) {
            stmt.bindString(2, userEmail);
        }
 
        String bookName = entity.getBookName();
        if (bookName != null) {
            stmt.bindString(3, bookName);
        }
 
        String chapterId = entity.getChapterId();
        if (chapterId != null) {
            stmt.bindString(4, chapterId);
        }
 
        String chapterName = entity.getChapterName();
        if (chapterName != null) {
            stmt.bindString(5, chapterName);
        }
 
        String imageId = entity.getImageId();
        if (imageId != null) {
            stmt.bindString(6, imageId);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(7, type);
        }
 
        String area = entity.getArea();
        if (area != null) {
            stmt.bindString(8, area);
        }
        stmt.bindLong(9, entity.getFinish() ? 1L: 0L);
 
        String lastUpdate = entity.getLastUpdate();
        if (lastUpdate != null) {
            stmt.bindString(10, lastUpdate);
        }
        stmt.bindLong(11, entity.getAddedTime());
        stmt.bindLong(12, entity.getUpdatedTime());
 
        String comment = entity.getComment();
        if (comment != null) {
            stmt.bindString(13, comment);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Book readEntity(Cursor cursor, int offset) {
        Book entity = new Book( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userEmail
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // bookName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // chapterId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // chapterName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // imageId
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // type
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // area
            cursor.getShort(offset + 8) != 0, // finish
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // lastUpdate
            cursor.getLong(offset + 10), // addedTime
            cursor.getLong(offset + 11), // updatedTime
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // comment
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Book entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserEmail(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setBookName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setChapterId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setChapterName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setImageId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setType(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setArea(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFinish(cursor.getShort(offset + 8) != 0);
        entity.setLastUpdate(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setAddedTime(cursor.getLong(offset + 10));
        entity.setUpdatedTime(cursor.getLong(offset + 11));
        entity.setComment(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Book entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Book entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Book entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
