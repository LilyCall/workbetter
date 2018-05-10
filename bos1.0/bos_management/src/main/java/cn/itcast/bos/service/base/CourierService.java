package cn.itcast.bos.service.base;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.bos.domain.base.Courier;

@Service
@Transactional
public interface CourierService {

	public abstract Page<Courier> pageQuery(Specification<Courier> specification, PageRequest pageRequest);

	public abstract void save(Courier model);

	public abstract List<Courier> findnoassociation();

}
