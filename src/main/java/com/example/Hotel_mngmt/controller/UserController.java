package com.example.Hotel_mngmt.controller;

import com.example.Hotel_mngmt.entities.User;
import com.example.Hotel_mngmt.model.Request.RequestUser;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.annotation.Resources;
import jdk.jfr.ContentType;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserController {
    @Operation(
            summary="saveUser",
            operationId="saveUser",
            tags="saveUser",
           responses = {
                    @ApiResponse(responseCode = "200",description = "User saved successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class))),
                            @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                                    schema = @Schema(implementation = User.class)))

}
    )
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/auth/saveUser",
            produces = "application/json",
            consumes = "application/json"
    )
    ResponseEntity<User> saveUser(@RequestBody RequestUser request);
    @Operation(
            summary="FetchUserByName",
            operationId="FetchUserByName",
            tags="FetchUserByName",
            responses = {
                    @ApiResponse(responseCode = "200",description = "User Fetched successfully",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class))),
                    @ApiResponse(responseCode = "401",description = "Error occurred",content=@Content(mediaType ="application/json",
                            schema = @Schema(implementation = User.class)))

            }
    )
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/auth/FetchUserByName",
            produces = "application/json"
    )
    ResponseEntity<User> FetchUserByName(@RequestParam String userName);
}
