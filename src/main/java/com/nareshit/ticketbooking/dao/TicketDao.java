package com.nareshit.ticketbooking.dao;
/*
 *  DAO Layer ==> Data Access Object Layer
 *
 *  If we need any operations with DATABASE , we can use this layer
 *
 *   Dataconnection Connection, Inserting the data,Updating the data, Retrieveing the data,deleting the data
 *
 *   CRUD OPERATIONS ==> C ==> CREATE
 *                       R ==> READ
 *                       U ==> UPDATE
 *                       D ==> DELETE
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.ticketbooking.model.Ticket;

@Repository
public interface TicketDao extends CrudRepository<Ticket, Integer> {


	/*
	 *
	 * Spring Boot completely automated the CRUD OPERATIOS WITH CRUD REPOSITORY
	 * DEVELOPER NO NEED TO WRITE BOILER PLATE CODE TO PERFORM CRUD OPERATIONS
	 *
	 *FINDALL ==> SELECT * FROM TABLE
	 *
	 *FINDBYID ==> SELECT * FROM TABLE WHERE PK=?
	 *
	 *SAVE ==> INSERT OR UPDATE
	 *
	 *DELETE ==> DELETE
	 *
	 *inputs for the CRUD REPOSITORY ARE ENTITY NAME AND DATATYPE OF ENTITY'S PRIMARY KEY
	 */

}
