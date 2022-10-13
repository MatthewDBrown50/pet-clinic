package com.codenamebear.petclinic.services;

import com.codenamebear.petclinic.model.Owner;
import com.codenamebear.petclinic.services.map.OwnerServiceMap;

import java.util.Set;

public interface OwnerService extends OwnerServiceMap<Owner, Long> {

    Owner findByLastName(String lastName);

}
