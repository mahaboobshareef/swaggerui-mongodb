/**
 * 
 */
package com.assignment.voucher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.voucher.entity.Voucher;
import com.assignment.voucher.repository.VoucherRepository;

/**
 * @author m.shareef.mohammed
 *
 */
@Service
public class VoucherService {
	
	@Autowired
	private VoucherRepository voucherRepository;

	private static final Logger log = LoggerFactory.getLogger(VoucherService.class);

	/**
	 * 
	 */
	public VoucherService() {
		// TODO Auto-generated constructor stub
	}

	public Voucher saveDetails(Voucher voucherDetails) {
		
		return voucherRepository.save(voucherDetails);

	}

}
