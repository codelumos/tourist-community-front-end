package org.csu.travelbyex.service.impl;

import org.csu.travelbyex.domain.*;
import org.csu.travelbyex.persistence.AppointmentMapper;
import org.csu.travelbyex.persistence.AppointmentParticipantMapper;
import org.csu.travelbyex.persistence.AppointmentReplyMapper;
import org.csu.travelbyex.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    AppointmentMapper appointmentMapper;
    @Autowired
    AppointmentParticipantMapper appointmentParticipantMapper;
    @Autowired
    AppointmentReplyMapper appointmentReplyMapper;

    //约
    @Override
    public void insertAppointment(Appointment appointment){
        appointmentMapper.insert(appointment);
    }

    @Override
    public void deleteAppointment(Integer appointmentId){
        appointmentMapper.deleteByPrimaryKey(appointmentId);
    }

    @Override
    public List getAllAppointments(){
        AppointmentExample appointmentExample = new AppointmentExample();
        AppointmentExample.Criteria criteria = appointmentExample.createCriteria();
        criteria.andTimeGreaterThan(new Date());
        return appointmentMapper.selectByExample(appointmentExample);
    }

    @Override
    public List getAppointmentsByAuthorId(String authorId){
        AppointmentExample appointmentExample = new AppointmentExample();
        AppointmentExample.Criteria criteria = appointmentExample.createCriteria();
        criteria.andAuthorIdEqualTo(authorId);
        return appointmentMapper.selectByExample(appointmentExample);
    }

    @Override
    public List getAppointmentsBySpotId(Integer spotId){
        AppointmentExample appointmentExample = new AppointmentExample();
        AppointmentExample.Criteria criteria = appointmentExample.createCriteria();
        criteria.andSpotIdEqualTo(spotId);
        return appointmentMapper.selectByExample(appointmentExample);
    }

    @Override
    public void updateAppointmentById(Appointment appointment) {
        appointmentMapper.updateByPrimaryKey(appointment);
    }

    //回复
    @Override
    public void insertAppointmentReply(AppointmentReply appointmentReply){
        appointmentReplyMapper.insert(appointmentReply);
    }

    @Override
    public List getAppointmentReplysByAppointmentId(Integer appointmentId){
        AppointmentReplyExample appointmentReplyExample = new AppointmentReplyExample();
        AppointmentReplyExample.Criteria criteria = appointmentReplyExample.createCriteria();
        criteria.andAppointmentIdEqualTo(appointmentId);
        return appointmentReplyMapper.selectByExample(appointmentReplyExample);
    }

    //队友信息
    @Override
    public void insertAppointmentParticipant(AppointmentParticipant appointmentParticipant){
        appointmentParticipantMapper.insert(appointmentParticipant);
    }

    @Override
    public List getAppointmentParticipantsByAppointmentId(Integer appointmentId){
        AppointmentParticipantExample appointmentParticipantExample = new AppointmentParticipantExample();
        AppointmentParticipantExample.Criteria criteria = appointmentParticipantExample.createCriteria();
        criteria.andAppointmentIdEqualTo(appointmentId);
        return appointmentParticipantMapper.selectByExample(appointmentParticipantExample);
    }


}
