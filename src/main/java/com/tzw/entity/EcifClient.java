package com.tzw.entity;


import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "EcifClient")
public class EcifClient {

    @Id
    private String clientId;

    private String clientName;

    private String clientNameEn;


}
