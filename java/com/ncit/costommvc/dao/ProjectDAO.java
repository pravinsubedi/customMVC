/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.costommvc.dao;

import com.ncit.costommvc.entity.Project;
import java.util.List;

/**
 *
 * @author pravin
 */
public interface ProjectDAO {
    List<Project> getAll();
    int insert(Project p);
    
    
}
