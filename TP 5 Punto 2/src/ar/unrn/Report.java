package ar.unrn;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Report implements Exportar {
	private String reporte;

	public Report(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {

		try {
			Files.write(Paths.get(file.getAbsolutePath()), this.reporte.getBytes(), StandardOpenOption.APPEND);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

	public String Reporte() {
		return this.reporte;
	}

}
