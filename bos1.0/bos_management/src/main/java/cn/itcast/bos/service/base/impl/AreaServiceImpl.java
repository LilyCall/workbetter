package cn.itcast.bos.service.base.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bos.dao.base.AreaRepository;
import cn.itcast.bos.domain.base.Area;
import cn.itcast.bos.service.base.AreaService;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {
	// 注入dao层
	@Autowired
	private AreaRepository areaRepository;

	public void save(List<Area> list) {
		areaRepository.save(list);
	}

	@Override
	public Page<Area> pageQuery(Pageable pageable, Specification<Area> spec) {
		return areaRepository.findAll(spec, pageable);
	}

	@Override
	public Area findOne(Area area) {
		return areaRepository.findByProvinceAndCityAndDistrict(area.getProvince(), area.getCity(), area.getDistrict());
	}

}
