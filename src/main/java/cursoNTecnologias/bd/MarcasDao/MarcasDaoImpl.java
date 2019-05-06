package cursoNTecnologias.bd.MarcasDao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Marcas;
import cursoNTecnologias.bd.mappers.MarcasMapper;

@Named
public class MarcasDaoImpl implements MarcasDao{
	SqlSession sqlSession;

	@Autowired
	public void setSqlSession (SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	

	@Override
	public Marcas obtenerMarcaId(Integer id) {
		Marcas marca = null;
		try {
			System.out.println("Obtener marca por Id");
			MarcasMapper marcasMapper = sqlSession.getMapper(MarcasMapper.class);
			marca = marcasMapper.obtenerMarcaId(id);
				System.out.println("Id: " + marca.getIdmarca());
				System.out.println("Nombre: " + marca.getNombremarca() + "\n");
				
			return marca;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}
	
	public List<Marcas> obtenerTodasMarca(){
		List<Marcas> list=null;
		try {
			MarcasMapper marcaMapper = sqlSession.getMapper(MarcasMapper.class);
			list = marcaMapper.obtenerTodasMarca();
			for(Marcas m:list) {
				System.out.println("\nId: "+ m.getIdmarca());
				System.out.println("Nombre: "+ m.getNombremarca());
			}
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
		
	}


	@Override
	public void agregarMarca(Marcas m) {
		// TODO Auto-generated method stub
		try {
			System.out.println("\nAgregando un nueva marca");
			MarcasMapper marcaMapper = sqlSession.getMapper(MarcasMapper.class);
			marcaMapper.agregarMarca(m);
			System.out.println("Id: " + m.getIdmarca());
			System.out.println("Nombre: " + m.getNombremarca());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}


	@Override
	public void deleteMarca(Integer id) {
		// TODO Auto-generated method stub
		try {
			MarcasMapper marcaMapper = sqlSession.getMapper(MarcasMapper.class);
			marcaMapper.deleteMarca(id);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}


	@Override
	public void updateMarca(Marcas m) {
		// TODO Auto-generated method stub
		try {
			MarcasMapper marcaMapper = sqlSession.getMapper(MarcasMapper.class);
			marcaMapper.updateMarca(m);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
}