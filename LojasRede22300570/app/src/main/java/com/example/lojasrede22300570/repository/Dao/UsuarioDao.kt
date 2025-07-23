package com.example.lojasrede22300570.repository.Dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.lojasrede.model.Usuario

@Dao
interface UsuarioDao {
    @Insert
    fun insertUser(usuario: Usuario): Long

    @Update
    fun updateUser(usuario: Usuario): Int

    @Delete
    fun deleteUser(usuario: Usuario): Int

    @Query("SELECT * FROM Usuarios WHERE id = :id")
    fun get(id: Int): Usuario

    @Query("SELECT * FROM Usuarios")
    fun getAll(): List<Usuario>

    @Query("SELECT * FROM Usuarios WHERE email = :input OR nome = :input LIMIT 1")
    fun buscarPorEmailOuNome(input: String): Usuario?
}