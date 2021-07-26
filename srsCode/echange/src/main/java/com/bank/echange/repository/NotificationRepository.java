package com.bank.echange.repository;

import com.bank.echange.entity.Notification;
import com.bank.echange.entity.TypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findAllByUserId(Long userId);

    List<Notification> findAllByType(TypeEnum type);

    List<Notification> findAllByUserIdAndType(Long userId, TypeEnum type);

}
