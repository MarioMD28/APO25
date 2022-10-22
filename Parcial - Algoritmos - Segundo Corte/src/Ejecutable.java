
public class Ejecutable {
public static void main(String[] args) {
	
			Serie listaSeries[] = new Serie[5];
			Videojuego listaVideojuegos[] = new Videojuego[5];
			
		//Ejemplos de series
		listaSeries[0] = new Serie("Monster: Dahmer", 1, "Drama", "Ryan Murphy");
		listaSeries[1] = new Serie("Peaky Blinders", 5, "Crimen", "Steven Knight");
		listaSeries[2] = new Serie("Dark", 3, "Aventura", "Baran Bo Odar");
		listaSeries[3] = new Serie("Betty la fea", 1, "Comedia", "Fernando Gaitan");
		listaSeries[4] = new Serie("Lucifer", 6, "Misterio", "Tom Kapinos");
		
		//Ejemplos de videojuegos
		listaVideojuegos[0] = new Videojuego("Geometry Dash", 100, "Aventura", "RobTop Games");
		listaVideojuegos[1] = new Videojuego("Call Of Duty", 8, "Shooter", "Activision");
		listaVideojuegos[2] = new Videojuego("Super Mario Bros", 2, "Plataformas", "Nintendo");
		listaVideojuegos[3] = new Videojuego("Minecraft", 85, "Estilo libre", "Mojang");
		listaVideojuegos[4] = new Videojuego("Red Dead Redemption 2", 150, "Mundo abierto", "Rockstar");
		
		//Entregas
		listaSeries[2].entregar();
		listaSeries[3].entregar();
		listaSeries[4].entregar();
		listaVideojuegos[1].entregar();
		listaVideojuegos[4].entregar();
		listaVideojuegos[0].entregar();
		
		
		int entregados = 0;
		
		for(int i=0;i<listaSeries.length;i++) {
			if(listaSeries[i].isEntregado()) {
				entregados+=1;
				listaSeries[i].devolver();
			}
			if(listaVideojuegos[i].isEntregado()) {
				entregados+=1;
				listaVideojuegos[i].devolver();
			}
		}
		
		System.out.println("Hay un total de " + entregados + " articulos entregados");
		System.out.println("============ ARTICULOS ENTREGADOS ============");
		
		Serie serieMayor=listaSeries[0];
		Videojuego videojuegoMayor=listaVideojuegos[0];
		
		for(int i=1;i<listaSeries.length;i++) {
			if(listaSeries[i].compareTo(serieMayor)==Serie.mayor) {
				serieMayor = listaSeries[i];
			}
			if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.mayor) {
				videojuegoMayor = listaVideojuegos[i];
			}
		}
		
		System.out.println(videojuegoMayor);
		System.out.println(serieMayor);
}
}
