package cn.jeeweb.generator.common.entity;

import cn.jeeweb.common.mvc.entity.AbstractEntity;
import cn.jeeweb.generator.common.constant.DataBaseConstant;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import java.util.Date;

/**
 * 数据Entity类
 * 
 * @author 王存见
 * @version 2016-12-03
 * @param <ID> 主键类型
 */
public abstract class DataEntity<ID> extends AbstractEntity<ID> {

	private static final long serialVersionUID = 1L;

	@TableField(value = "remarks")
	protected String remarks; // 备注
	@TableField(value = "create_date", fill = FieldFill.INSERT)
	protected Date createDate; // 创建日期
	@TableField(value = "update_date", fill = FieldFill.UPDATE)
	protected Date updateDate; // 更新日期
	@TableField(value = "del_flag", fill = FieldFill.INSERT)
	protected String delFlag = "0"; // 删除标记（0：正常；1：删除 ）

	public DataEntity() {
		super();
		this.delFlag = DataBaseConstant.DEL_FLAG_NORMAL;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
}
