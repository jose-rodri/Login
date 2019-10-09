	var hoy = new Date();
	var mes = hoy.getMonth()-1;
	var DiaHoy = hoy.getDate()-1;
	var anno = hoy.getFullYear();
	var dia= getUltimoDiaDelMes(mes,anno);
	var meses = new Array("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
	
function calendario(){
	var div_calendario = document.getElementById('calendario');
	var calendario ="";
	
	var diasSemana = new Array("D","L","M","X","J","V","S");
	var contadorDias =0;
	var PrimerDia=  new Date(parseInt(anno),parseInt(mes),"01");
	var Ddia =  PrimerDia.getDay();
	
	 
	
	calendario ="";
	for (var i = 0; i< 6; i++){
		
		calendario +="<tr>";
		for ( var j=0 ; j< 7;j++){
			
			if( i==0){
				calendario +="<td class='cab-sem'>"+diasSemana[j]+"</td>";
			}
			else if( contadorDias < dia && i != 0){
					if( i ==1){
							if (diasSemana[j] == diasSemana[Ddia] && contadorDias == 0  ){
								 if (DiaHoy == contadorDias){
									contadorDias++;
									calendario +="<th class='cab-dia diaHoy'>"+contadorDias+"</th>";
								  }
								  else {
									 contadorDias++;
									calendario +="<td class='cab-dia'>"+contadorDias+"</td>";
									}
								
							}
							else if (contadorDias != 0 ){
								 if (DiaHoy == contadorDias){
									contadorDias++;
									calendario +="<td class='cab-dia diaHoy'>"+contadorDias+"</td>";
								  }
								  else {
									 contadorDias++;
									calendario +="<td class='cab-dia'>"+contadorDias+"</td>";
									}
							}
							else{
								calendario +="<td></td>";
							}
					 
						
					}
					else {
						 if (DiaHoy == contadorDias){
									contadorDias++;
									calendario +="<td class='cab-sem diaHoy'>"+contadorDias+"</td>";
						 }
						 else {
									 contadorDias++;
									calendario +="<td class='cab-sem'>"+contadorDias+"</td>";
						  }
					}
			}else{
				calendario +="<td></td>";
			}
				
		}
		calendario +="</tr>";
	}
	
	div_calendario.innerHTML= "<table border='0' id='tabla-calendar'> <tr><TD class='cab-mes' colspan='7'>"+meses[mes]+" - "+anno+"</TD></tr>"+calendario;

}


calendario()


function getUltimoDiaDelMes( mes, ano ){
	return new Date(ano || new Date().getFullYear(), mes, 0).getDate();
}

 














