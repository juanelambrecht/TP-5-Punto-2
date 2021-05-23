package ar.unrn;

import java.io.File;

public class ReportExistente implements Exportar {
	private String reporte;
	Exportar exportar;
	
	public ReportExistente(String reporte,Exportar exportar) {
		this.reporte = reporte;
		this.exportar = exportar;
	}

	@Override
	public void export(File file) {

		if (file == null) {
			throw new IllegalArgumentException("File es NULL no puedo exportar...");

		}
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");

		}

		this.exportar.export(file);
		
	}

}
