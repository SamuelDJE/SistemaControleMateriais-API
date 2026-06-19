package com.biolab.sistemacontrolemateriais.Controllers;


import com.biolab.sistemacontrolemateriais.entities.Material;
import com.biolab.sistemacontrolemateriais.repositories.MaterialRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MaterialController {

    private final MaterialRepository materialRepository;

    public MaterialController(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    @PostMapping(value = "/criar")
    public String criarMaterial(@RequestBody Material material){
        Material m = new Material(material.getNome(), material.getQuantidade(), material.getValorUnitario(), material.getCategoria(), material.getUnidadeMedida());
        materialRepository.save(m);
        return "Criado com sucesso";
    }

    @GetMapping(value = "/mostrar")
    public List<Material> mostraMaterial(){
        List<Material> listaMaterial = materialRepository.findAll();
        return listaMaterial;
    }






}
