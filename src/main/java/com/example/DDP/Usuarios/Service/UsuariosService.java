package com.example.DDP.Usuarios.Service;

import com.example.DDP.Usuarios.Repository.*;
import com.example.DDP.Usuarios.DTOs.*;
import com.example.DDP.Usuarios.Model.*;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    private final ClienteRepository clienteRepository;
    private final ProveedorRepository proveedorRepository;

    public UsuariosService(ClienteRepository clienteRepository, ProveedorRepository proveedorRepository) {
        this.clienteRepository = clienteRepository;
        this.proveedorRepository =proveedorRepository;
    }

    //Insertar nuevo cliente-----------------------------------------------------------------------------------------------------
    public SelectClienteDTO crearCliente (InsertClienteDTO dto){

        Cliente cliente = new Cliente(dto.getNombre(), dto.getDireccion(), 
        dto.getTelefono(), dto.getRFC(), dto.getSaldo());

        Cliente guardado = clienteRepository.save(cliente);

        SelectClienteDTO respuesta = new SelectClienteDTO(guardado.getID(), guardado.getNombre(), 
        guardado.getDireccion(), guardado.getTelefono(), guardado.getRFC(), guardado.getSaldo());
        
        return respuesta;
    }

    //Editar un cliente----------------------------------------------------------------------------------------------------------
    public SelectClienteDTO editarCliente(UpdateClienteDTO dto){
        
        Cliente cliente = clienteRepository.findById(dto.getId()).orElseThrow(() -> new RuntimeException(
        "Cliente no encontrado"));

        cliente.updateNombre(dto.getNombre());
        cliente.updateDireccion(dto.getDireccion());
        cliente.updateRFC(dto.getRFC());
        cliente.updateTelefono(dto.getTelefono());

        Cliente guardado = clienteRepository.save(cliente);

        SelectClienteDTO respuesta = new SelectClienteDTO(guardado.getID(), guardado.getNombre(), guardado.getDireccion(),
        guardado.getTelefono(), guardado.getRFC(), guardado.getSaldo());

        return respuesta;
    }

    //Visualizamos los datos del cliente------------------------------------------------------------------------------------------
    public SelectClienteDTO verCliente(int id){
        
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException(
        "Cliente no encontrado"));

        SelectClienteDTO consulta = new SelectClienteDTO(id, cliente.getNombre(), cliente.getDireccion(), 
        cliente.getTelefono(), cliente.getRFC(), cliente.getSaldo());

        return consulta;
    }

    //Eliminar un cliente-------------------------------------------------------------------------------------------------------
    public void eliminarCliente(int id){
        
        if(clienteRepository.existsById(id)){
            clienteRepository.deleteById(id);
        }
        else{
            throw new RuntimeException("Error: Usuario inexistente ");
        }
    }

    //Insertar nuevo proveedor---------------------------------------------------------------------------------------------------
    public SelectProveedorDTO crearProveedor(InsertProveedorDTO dto){
        
        Proveedor proveedor = new Proveedor(dto.getNombre(), dto.getEditorial(),
        dto.getTelefono(), dto.getSaldo());

        Proveedor guardado = proveedorRepository.save(proveedor);

        SelectProveedorDTO respuesta = new SelectProveedorDTO(guardado.getId(), guardado.getNombre(),
        guardado.getEditorial(), guardado.getTelefono(), guardado.getSaldo());
        
        return respuesta;
    }

    //Viusualizamos los datos de un proveedor---------------------------------------------------------------------------------------
    public SelectProveedorDTO verProveedor(int id){
        Proveedor proveedor = proveedorRepository.findById(id).orElseThrow(() -> new RuntimeException(
        "Cliente no encontrado"));
        
        SelectProveedorDTO consulta = new SelectProveedorDTO(id, proveedor.getNombre(), proveedor.getEditorial(), 
            proveedor.getTelefono(), proveedor.getSaldo());

            return consulta;
    }

    //Editar un proveedor--------------------------------------------------------------------------------------------------------
    public SelectProveedorDTO editarProveedor(UpdateProveedorDTO dto){
        
        Proveedor proveedor = proveedorRepository.findById(dto.getId()).orElseThrow(() -> new RuntimeException(
        "Cliente no encontrado"));
        
        proveedor.updateNombre(dto.getNombre());
        proveedor.updateEditorial(dto.getEditorial());
        proveedor.updateTelefono(dto.getTelefono());

        Proveedor guardado = proveedorRepository.save(proveedor);

        SelectProveedorDTO respuesta = new SelectProveedorDTO(guardado.getId(), guardado.getNombre(), 
        guardado.getEditorial(), guardado.getTelefono(), guardado.getSaldo());

        return respuesta;
    }    

    //Eliminar un proveedor------------------------------------------------------------------------------------------------------
    public void eliminarProveedor(int id){
        
        if(proveedorRepository.existsById(id)){
            proveedorRepository.deleteById(id);
        }
        else{
            throw new RuntimeException("Error: Usuario inexistente ");
        }
    }
}