package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import ar.unrn.Exportar;
import ar.unrn.Report;
import ar.unrn.ReportExistente;

class ReportTest {

	@Test
	void testExportarArchivoExistente() {

		String reporte = "Reporte: se escribio el archivo con exito";

		Exportar exportar = new Report(reporte);
		String nombreArchivo = "ArchivoExport.txt";

		exportar.export(new File(nombreArchivo));
		// assert
	}

	@Test
	void testExportarArchivoNoExistente() {
		String reporte = "Reporte: se escribio el archivo con exito";

		Exportar exportar = new ReportExistente(reporte, new Report(reporte));
		String nombreArchivo = "ArchivoExport.txt";

		assertThrows(IllegalArgumentException.class, () -> {
			exportar.export(new File(nombreArchivo));
		});
	}

}
