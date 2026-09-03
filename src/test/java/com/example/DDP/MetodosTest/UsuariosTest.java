package com.example.DDP.MetodosTest;

import com.example.DDP.Usuarios.Service.UsuariosService;
import com.example.DDP.Usuarios.DTOs.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import jakarta.transaction.Transactional;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class UsuariosTest {
    
    @Autowired
    private UsuariosService clienteService;

    //Test para guardar clientes-----------------------------------------------------------------------------------------------------------------------------------------------------
    @Test
	public void debeGuardarClienteNuevo() {
        InsertClienteDTO entradaDto = new InsertClienteDTO("Kevin", "Corregidora N 30, Tlalpan",
        "7443380069", "SONK00710B3");
        
        SelectClienteDTO resultadoDto = clienteService.crearCliente(entradaDto);
        
        assertNotNull(resultadoDto.getId());    

        assertEquals(6, resultadoDto.getId());
        assertEquals("Kevin", resultadoDto.getNombre());
        assertEquals("7443380069", resultadoDto.getTelefono());
	}

    //Test para seleccionar los clientes---------------------------------------------------------------------------------------------
    @Test
    public void debeSeleccioanarClienteExistente(){
        SelectClienteDTO entradaDto = clienteService.verCliente(2);

        assertEquals(2, entradaDto.getId());
    }

    //Test para editar un cliente-------------------------------------------------------------------------------------------------------
    @Test
    public void debeEditarClienteExistente(){
        UpdateClienteDTO entradaDTO = new UpdateClienteDTO(2, "Daniela", "Monterrey",
        "5697569054", "VIVE000719k");

        SelectClienteDTO resultadoDto = clienteService.editarCliente(entradaDTO);

        assertEquals(2, resultadoDto.getId());
        assertEquals("Daniela", resultadoDto.getNombre());
        assertEquals("Monterrey", resultadoDto.getDireccion());
    }

    //Test para eliminar un cliente---------------------------------------------------------------------------------------------
    @Test
    public void debeEliminarClienteExistente(){
        int id = 4;
        clienteService.eliminarCliente(id);
    }

    //Test para crear un nuevo cliente-------------------------------------------------------------------------------------------------   
    @Test
    public void debeCrearNuevoProveedor(){
        InsertProveedorDTO entradaDto = new InsertProveedorDTO("Chuy", "La Jornada", "7441803813");

        SelectProveedorDTO resultado = clienteService.crearProveedor(entradaDto);

        assertNotNull(resultado.getId());
        assertEquals(3, resultado.getId());
        assertEquals("Chuy", resultado.getNombre());
        assertEquals("7441803813", resultado.getTelefono());
    }

    //Test para seleccionar un proveedor-------------------------------------------------------------------------------------------
    @Test
    public void debeSeleccionarProveedorExistente(){
        SelectProveedorDTO cliente = clienteService.verProveedor(2);

        assertEquals(2, cliente.getId());
        assertEquals("Chuy", cliente.getNombre());
    }

    //Test para eidtar un proveedor-------------------------------------------------------------------------------------------------
    @Test
    public void debeEditarProveedorExistente(){
        UpdateProveedorDTO entradaDTO = new UpdateProveedorDTO(2, "Axel", "La Jornada", "7441825813");
        SelectProveedorDTO resultado = clienteService.editarProveedor(entradaDTO);

        assertEquals(2, resultado.getId());
        assertEquals("Axel", resultado.getNombre());
        assertEquals("7441825813", resultado.getTelefono());
    }

    //Test para eliminar un proveedor-----------------------------------------------------------------------------------------------
    @Test
    public void debeEliminarProveedorExistente(){
        int id = 3;
        clienteService.eliminarProveedor(id);
    }
}