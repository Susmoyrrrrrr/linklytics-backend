package com.url.shortner.repository;

import com.url.shortner.models.ClickEvents;
import com.url.shortner.models.UrlMapping;
import com.url.shortner.models.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ClickEventRepository extends JpaRepository<ClickEvents,Long> {



    List<ClickEvents> findByUrlMappingAndCreatedDateBetween(UrlMapping mapping, LocalDateTime starDate,LocalDateTime endDate);
    List<ClickEvents> findByUrlMappingInAndCreatedDateBetween(List<UrlMapping> urlMapping, LocalDateTime starDate,LocalDateTime endDate);
}
