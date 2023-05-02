/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Academia;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 08050431
 */
public class CadastroDadosSaude implements DAO {

	private ArrayList cadastro = new ArrayList();

	@Override
	public boolean create(Object obj) {
		if (obj != null && obj instanceof Pessoa) {
			Pessoa par = (Pessoa) obj;
			return this.cadastro.add(par);
		}
		return false;
	}

	@Override
	public Object read(Object obj) {
		if (obj != null && obj instanceof Pessoa) {
			String par = (String) obj;

			Iterator it = cadastro.iterator();
			while (it.hasNext()) {
				Pessoa p = (Pessoa) it.next();
				if (p.getCpf().equals(par)) {
					return p;
				}
			}
		}
		return null;
	}

	@Override
	public boolean update(Object obj) {
		if (obj != null && obj instanceof Pessoa) {
			Pessoa par = (Pessoa) obj;

			Iterator it = cadastro.iterator();
			int index;

			while (it.hasNext()) {
				Pessoa p = (Pessoa) it.next();

				if (par.getCpf().equals(p)) {
					index = cadastro.indexOf(p);
					this.cadastro.set(index, par);
					return true;
				}

			}
		}
		return false;
	}

	@Override
	public boolean delete(Object obj) {
		if (obj != null && obj instanceof Pessoa) {
			String par = (String) obj;

			Pessoa p = (Pessoa) this.read(par);

			return cadastro.remove(p);
		}
		return false;
	}

}
