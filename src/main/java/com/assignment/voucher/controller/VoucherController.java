/**
 * 
 */
package com.assignment.voucher.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.voucher.entity.Voucher;
import com.assignment.voucher.service.VoucherService;

/**
 * @author m.shareef.mohammed
 *
 */
@RestController
@RequestMapping(value = "/voucher")
@CrossOrigin
public class VoucherController {

	private static final Logger log = LoggerFactory.getLogger(VoucherController.class);

	@Autowired
	private VoucherService voucherService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public Voucher saveVoucherDetails(@RequestBody Voucher voucherDetails) {

		Voucher saved = null;

		if (voucherDetails != null) {
			saved = voucherService.saveDetails(voucherDetails);
		}
		return saved;
	}
	
	@RequestMapping(value="/view" , method = RequestMethod.GET)
	public List<Voucher> getAllVoucherDetails() {
		
		return voucherService.getAllVoucherDetails();
	}
	
	
}
