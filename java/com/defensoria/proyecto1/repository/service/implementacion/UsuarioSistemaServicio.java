 package com.defensoria.proyecto1.repository.service.implementacion;

import org.springframework.stereotype.Service;

import com.defensoria.proyecto1.entity.Cargos;
import com.defensoria.proyecto1.entity.UsuarioSistema;
import com.defensoria.proyecto1.repository.repositorioUsuarioSistema;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service("usuarioSistemaServicio")
public class UsuarioSistemaServicio implements UserDetailsService{
   
	@Autowired
	@Qualifier("repositorioUsuarioSistema")
	private repositorioUsuarioSistema repositorioUsuario;
	
	@Override
	public UserDetails loadUserByUsername(String usuarioSistema) throws UsernameNotFoundException {
		UsuarioSistema usuario=repositorioUsuario.findByUsername(usuarioSistema);	
		
		List<GrantedAuthority> authorities = buildAuthorities(usuario.getRolesUsuario());
		return builUser(usuario,authorities);
	}
	
	 
	private User builUser(UsuarioSistema usuario,List<GrantedAuthority> authorities) {
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEstado(),
				true, true, true, authorities);
	}
// convertir a una lista de los usuario
	private List<GrantedAuthority> buildAuthorities(Set<Cargos> cargos){
		
		Set<GrantedAuthority> auths =new HashSet<GrantedAuthority>();
	    for (Cargos rol : cargos) {
	    	auths.add(new SimpleGrantedAuthority(rol.getCargo()));
			
		}
	    return new ArrayList<GrantedAuthority>(auths);
	}
}
