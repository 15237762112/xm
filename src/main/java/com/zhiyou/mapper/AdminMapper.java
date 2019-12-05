package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Admin;
import com.zhiyou.model.Speaker;

public interface AdminMapper {

	Admin login(String accounts);

	List<Speaker> videShow();

	Speaker SpeakerSelectById(Integer id);

}
