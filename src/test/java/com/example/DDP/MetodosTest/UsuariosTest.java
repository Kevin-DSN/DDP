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
        InsertClienteDTO entradaDto = new InsertClienteDTO("Juan", "Monterrey Nl",
        "7445698532", "JPVQ00710B3");
        
        SelectClienteDTO resultadoDto = clienteService.crearCliente(entradaDto);
        
        System.out.println("Cliente registrado: "+resultadoDto.getId()+", "+resultadoDto.getNombre()+", "+resultadoDto.getTelefono()
        +", "+resultadoDto.getRFC()+", "+resultadoDto.getDireccion()+", "+resultadoDto.getSaldo());

        assertNotNull(resultadoDto.getId());    

        assertEquals(5, resultadoDto.getId());
        assertEquals("Juan", resultadoDto.getNombre());
        assertEquals("7445698532", resultadoDto.getTelefono());
        assertEquals(0.0, resultadoDto.getSaldo());
	}
    

    //Test para seleccionar los clientes---------------------------------------------------------------------------------------------
    @Test
    public void debeSeleccioanarClienteExistente(){
        SelectClienteDTO resultadoDto = clienteService.verCliente(2);

        System.out.println("Cliente seleccionado: "+resultadoDto.getId()+", "+resultadoDto.getNombre()+", "+resultadoDto.getTelefono()
        +", "+resultadoDto.getRFC()+", "+resultadoDto.getDireccion()+", "+resultadoDto.getSaldo());
        assertEquals(2, resultadoDto.getId());
    }

    //Test para editar un cliente-------------------------------------------------------------------------------------------------------
    @Test
    public void debeEditarClienteExistente(){
        UpdateClienteDTO entradaDTO = new UpdateClienteDTO(2, "Joan Ambriz", "KFC",
        "7442379067", "JOMA045710BA3");

        SelectClienteDTO resultadoDto = clienteService.editarCliente(entradaDTO);

        System.out.println("Cliente editado: "+resultadoDto.getId()+", "+resultadoDto.getNombre()+", "+resultadoDto.getTelefono()
        +", "+resultadoDto.getRFC()+", "+resultadoDto.getDireccion()+", "+resultadoDto.getSaldo());

        assertEquals(2, resultadoDto.getId());
        assertEquals("Joan Ambriz", resultadoDto.getNombre());
        assertEquals("KFC", resultadoDto.getDireccion());
    }

    //Test para eliminar un cliente---------------------------------------------------------------------------------------------
    @Test
    public void debeEliminarClienteExistente(){
        int id = 4;
        clienteService.eliminarCliente(id);
    }

    //Test para crear un nuevo proveedor-------------------------------------------------------------------------------------------------   
    @Test
    public void debeCrearNuevoProveedor(){
        InsertProveedorDTO entradaDto = new InsertProveedorDTO("Chuy", "La Jornada", "7441803813");

        SelectProveedorDTO resultado = clienteService.crearProveedor(entradaDto);
        System.out.println("Nuevo proveedor: "+resultado.getId()+", "+resultado.getNombre()+", "+resultado.getEditorial()+
        ", "+resultado.getTelefono()+", "+resultado.getSaldo());

        assertNotNull(resultado.getId());
        assertEquals(3, resultado.getId());
        assertEquals("Chuy", resultado.getNombre());
        assertEquals("7441803813", resultado.getTelefono());
    }

    //Test para seleccionar un proveedor-------------------------------------------------------------------------------------------
    @Test
    public void debeSeleccionarProveedorExistente(){
        SelectProveedorDTO resultado = clienteService.verProveedor(2);

        System.out.println("Proveedor seleccionado: "+resultado.getId()+", "+resultado.getNombre()+", "+resultado.getEditorial()+
        ", "+resultado.getTelefono()+", "+resultado.getSaldo());

        assertEquals(2, resultado.getId());
        assertEquals("Anelime Salgado", resultado.getNombre());
    }

    //Test para editar un proveedor-------------------------------------------------------------------------------------------------
    @Test
    public void debeEditarProveedorExistente(){
        UpdateProveedorDTO entradaDTO = new UpdateProveedorDTO(1, "Graciela Hernandez", "Porrua", "5589007658");
        SelectProveedorDTO resultado = clienteService.editarProveedor(entradaDTO);

        System.out.println("Proveedor editado: "+resultado.getId()+", "+resultado.getNombre()+", "+resultado.getEditorial()+
        ", "+resultado.getTelefono()+", "+resultado.getSaldo());

        assertEquals(1, resultado.getId());
        assertEquals("Graciela Hernandez", resultado.getNombre());
        assertEquals("5589007658", resultado.getTelefono());
    }

    //Test para eliminar un proveedor-----------------------------------------------------------------------------------------------
    @Test
    public void debeEliminarProveedorExistente(){
        int id = 2;
        clienteService.eliminarProveedor(id);
    }
}