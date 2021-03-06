package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by serdartugcu on 17.03.2018.
 */
@Entity
@Table(name = "dept_emp_latest_date", schema = "", catalog = "employees")
public class DeptEmpLatestDate {
    private Integer empNo;
    private Date fromDate;
    private Date toDate;

    @Basic
    @Column(name = "emp_no", nullable = false, insertable = true, updatable = true)
    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    @Basic
    @Column(name = "from_date", nullable = true, insertable = true, updatable = true)
    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date", nullable = true, insertable = true, updatable = true)
    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeptEmpLatestDate that = (DeptEmpLatestDate) o;

        if (empNo != null ? !empNo.equals(that.empNo) : that.empNo != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = empNo != null ? empNo.hashCode() : 0;
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        return result;
    }
}
