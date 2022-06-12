package com.luisseidel.adapters.outbound.repository;

import com.luisseidel.adapters.inbound.entity.EnderecoEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EnderecoRepository implements PanacheRepository<EnderecoEntity> {}
