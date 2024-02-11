package ej02_Contraseñas;

public class Password {

	public int longitud;
	public String contraseña;
	
	public Password() {
		longitud = 8;
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		contraseña = generarPassword();
	}
	
	public boolean esFuerte() {
		
		int numMayus = 0;
		int numMinus = 0;
		int numNum = 0;
		boolean esFuerte = true;
		
		for(int i=0; i < contraseña.length(); i++) {
			
			char caracter = contraseña.charAt(i);
			
			if(caracter >= 'A' && caracter <= 'Z') {
				numMayus++;
			}
			else if(caracter >= 'a' && caracter <= 'z') {
				numMinus++;
			}
			else if(caracter >= '0' && caracter <= '9') {
				numNum++;
			}
			
		}
		if(numMayus > 2 && numMinus > 1 && numNum > 5)  return esFuerte ;
		else return false;
	}
	
	public String generarPassword() {
		 String password="";
	        for (int i=0;i<longitud;i++){
	            int eleccion=((int)(Math.random()*3+1));
	  
	            if (eleccion==1){
	                char minusculas=(char)((int)(Math.random()*(123-97)+97));
	                password+=minusculas;
	            }else{
	                if(eleccion==2){
	                    char mayusculas=(char)((int)(Math.random()*(91-65)+65));
	                    password+=mayusculas;
	                }else{
	                    char numeros=(char)((int)(Math.random()*(58-48)+48));
	                    password+=numeros;
	                }
	            }
	        }
	        return password;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String getContraseña() {
		return contraseña;
	}
}
