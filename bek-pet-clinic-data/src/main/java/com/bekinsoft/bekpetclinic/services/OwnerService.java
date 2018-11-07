package com.bekinsoft.bekpetclinic.services;

import com.bekinsoft.bekpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
