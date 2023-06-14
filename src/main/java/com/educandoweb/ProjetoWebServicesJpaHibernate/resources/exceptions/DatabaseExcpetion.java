package com.educandoweb.ProjetoWebServicesJpaHibernate.resources.exceptions;

import java.io.Serial;

public class DatabaseExcpetion extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public DatabaseExcpetion(String msg){
        super(msg);
    }
}
