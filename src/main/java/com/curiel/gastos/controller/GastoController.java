package com.curiel.gastos.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curiel.gastos.model.entity.Gasto;

@RestController
@RequestMapping(value="/gasto")
public class GastoController {

//crear un metodo y que regrese una lista de los gastos
	@GetMapping
	public List<Gasto> getGastos(){
		
		Gasto gastoLuz= new Gasto();
		gastoLuz.setId(1);
		gastoLuz.setDesripcion("pago de luz");
		gastoLuz.setTotal(new BigDecimal(300));
		
		Gasto gastoAgua= new Gasto();
		gastoAgua.setId(2);
		gastoAgua.setDesripcion("pagao de Agua");
		gastoAgua.setTotal(new BigDecimal(120));
		
		Gasto gastoGas= new Gasto();
		gastoGas.setId(3);
		gastoGas.setDesripcion("pago de servicio de gas");
		gastoGas.setTotal(new BigDecimal(250));
		
		List<Gasto> ListaGasto= new ArrayList<>();
		ListaGasto.add(gastoLuz);
		ListaGasto.add(gastoAgua);
		ListaGasto.add(gastoGas);
		
		return ListaGasto;
		
	}
}
