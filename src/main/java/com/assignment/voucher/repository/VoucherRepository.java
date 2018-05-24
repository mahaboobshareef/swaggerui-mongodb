/**
 * 
 */
package com.assignment.voucher.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.assignment.voucher.entity.Voucher;

/**
 * @author m.shareef.mohammed
 *
 */
public interface VoucherRepository extends MongoRepository<Voucher, Integer>{


	
}
