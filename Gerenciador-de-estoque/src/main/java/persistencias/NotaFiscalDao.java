package persistencias;

import java.util.List;
import model.NotaFiscal;

public class NotaFiscalDao extends Dao {
    private static final NotaFiscalDao instancia = new NotaFiscalDao();
    
    private NotaFiscalDao(){}
    
    public static NotaFiscalDao getInstancia() {
        return instancia;
    }
    
    public List listar() {
        return em.createNativeQuery("select * from cidade p", NotaFiscal.class).getResultList();
    }
}
