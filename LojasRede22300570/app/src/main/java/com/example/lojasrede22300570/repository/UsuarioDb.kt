package com.example.lojasrede22300570.repository


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.lojasrede.model.Usuario
import com.example.lojasrede22300570.repository.Dao.UsuarioDao

@Database(entities = [Usuario::class], version = 1)
abstract class UsuarioDb: RoomDatabase() {

    abstract fun usuarioDAO(): UsuarioDao//Referência de UsuarioDAO, pois iremos selecionar essa classe por meio da instancia do banco

    companion object{
        private lateinit var INSTANCE: UsuarioDb

        fun getDataBase(context: Context): UsuarioDb{
            if(!::INSTANCE.isInitialized) {
                synchronized(UsuarioDb::class) {
                    INSTANCE =
                        Room.databaseBuilder(context, UsuarioDb::class.java, "usuariodb").addMigrations(
                            MIGRATION_1_2, MIGRATION_2_3).allowMainThreadQueries().build()
                }
            }
            return INSTANCE
        }

        private val MIGRATION_1_2: Migration = object : Migration(1, 2){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

        private val MIGRATION_2_3: Migration = object : Migration(2, 3){
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL("")
            }
        }

    }

}