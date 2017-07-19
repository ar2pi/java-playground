/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.buscador;

import java.util.List;

/**
 *
 * @author arthur.picerna
 */
public class ResultadoDeBusqueda {
    private List<Pagina> paginas;
    private int resultadosPorPagina = 5;

    public ResultadoDeBusqueda(List<ResultadoElemento> elementos) {
        int count = 0;
        int pagCount = 1;
        Pagina pagina = new Pagina(pagCount);
        paginas.add(pagina);
        for(ResultadoElemento elemento : elementos) {
            if(count % resultadosPorPagina == 0) {
                pagCount++;
                pagina = new Pagina(pagCount);
                paginas.add(pagina);
            }
            pagina.addResultado(elemento);
            count++;
        }
    }

    public void addPagina(Pagina pagina) {
        this.paginas.add(pagina);
    }
    
    public List<Pagina> getPaginas() {
        return paginas;
    }

    public void setPaginas(List<Pagina> paginas) {
        this.paginas = paginas;
    }

    public int getResultadosPorPagina() {
        return resultadosPorPagina;
    }

    public void setResultadosPorPagina(int resultadosPorPagina) {
        this.resultadosPorPagina = resultadosPorPagina;
    }
}
