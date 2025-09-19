package com.example.Hotel_mngmt.controller;

import com.example.Hotel_mngmt.entities.User;
import com.example.Hotel_mngmt.model.Request.RequestCustomer;
import com.example.Hotel_mngmt.model.Request.RequestCustomerId;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface CustomerController {
    @Operation(
            summary="saveCustomer",
            operationId="saveCustomer",
            tags="Customer",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/auth/saveCustomer",
            produces = "application/json",
            consumes = "application/json"
    )
    ResponseEntity<?> saveCustomer(@RequestBody RequestCustomer requestCustomer);

    @Operation(
            summary="fetchCustomerDetails",
            operationId="fetchCustomerDetails",
            tags="Customer",
            responses = {
                    @ApiResponse(responseCode = "200",description = "saveCustomer saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/auth/fetchCustomerDetails",
            produces = "application/json"
    )
    ResponseEntity<?> fetchCustomerDetails(RequestCustomerId request);
}
