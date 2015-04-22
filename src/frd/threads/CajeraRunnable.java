package frd.threads;

import frd.domain.Cajera;
import frd.domain.Cliente;

public class CajeraRunnable implements Runnable {

	private Cliente cliente;
	private Cajera cajera;
	private long initialTime;
	
	public CajeraRunnable (Cliente cliente, Cajera cajera, long initialTime){
		this.cajera = cajera;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}

	@Override
	public void run() {
		this.cajera.procesarCompra(this.cliente, this.initialTime);
	}

}
