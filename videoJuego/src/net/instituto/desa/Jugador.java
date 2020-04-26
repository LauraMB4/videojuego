package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void movimientoDerecha() {
		this.x++;
	}
	
	public void movimientoIzquierda() {
		this.x--;
	}

	public void movimientoArriba() {
		this.y--;
	}

	public void movimientoAbajo() {
		this.y++;
	}
}
