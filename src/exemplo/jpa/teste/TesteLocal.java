package exemplo.jpa.teste;

import exemplo.jpa.dao.LocalDAO;
import exemplo.jpa.modelo.Local;

public class TesteLocal {
    public static void main(String[] args) {
        Local l = new Local();
        l.setPredio("Facebook");
        l.setSala("F240");
        l.setCapacidade(800);

        LocalDAO dao = new LocalDAO();
        dao.salvar(l);
    }
}
