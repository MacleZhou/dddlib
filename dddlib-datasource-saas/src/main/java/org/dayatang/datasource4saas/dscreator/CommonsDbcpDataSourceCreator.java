package org.dayatang.datasource4saas.dscreator;


import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

/**
 * 基于Apache Commons DBCP连接池的数据源创建器
 * @author yyang (<a href="mailto:gdyangyu@gmail.com">gdyangyu@gmail.com</a>)
 *
 */
public class CommonsDbcpDataSourceCreator extends AbstractDataSourceCreator {

	@Override
	protected DataSource createDataSource() {
		return new BasicDataSource();
	}

	@Override
	protected String getDriverClassPropName() {
		return "driverClassName";
	}

	@Override
	protected String getUrlPropName() {
		return "url";
	}

	@Override
	protected String getUsernamePropName() {
		return "username";
	}

	@Override
	protected String getPasswordPropName() {
		return "password";
	}
}
