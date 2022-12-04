import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.mip.DbSQLite;

public class DbOutput {
    DbSQLite dbSQLite;
    public void outputDb(){
        SQLiteDatabase database = dbSQLite.getWritableDatabase();
        Cursor cursor = database.query(DbSQLite.TABLE_WOOD,null,null,null,null,null,null);
        if(cursor.moveToFirst()){

        }
    }
}
