/*
 * Kimios - Document Management System Software
 * Copyright (C) 2012-2013  DevLib'
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.kimios.kernel.ws.pojo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class DMEntity implements Serializable
{
    protected long uid;

    protected int type;

    protected String name;

    protected Calendar creationDate;

    protected Calendar updateDate;

    protected String owner;

    protected String ownerSource;

    protected String path;

    public DMEntity()
    {
    }

    public DMEntity(long uid, int type, String name, Date creationDate,
            String owner, String ownerSource, String path)
    {
        this.uid = uid;
        this.type = type;
        this.name = name;
        this.creationDate = Calendar.getInstance();
        this.creationDate.setTime(creationDate);
        this.owner = owner;
        this.ownerSource = ownerSource;
        this.path = path;
    }

    public DMEntity(long uid, int type, String name,
                    String owner, String ownerSource, Date creationDate,
                    Date updateDate, String path)
    {
        this.uid = uid;
        this.type = type;
        this.name = name;
        this.creationDate = Calendar.getInstance();
        this.creationDate.setTime(creationDate);
        this.updateDate = Calendar.getInstance();
        this.updateDate.setTime(updateDate);
        this.owner = owner;
        this.ownerSource = ownerSource;
        this.path = path;
    }

    public long getUid()
    {
        return uid;
    }

    public void setUid(long uid)
    {
        this.uid = uid;
    }

    public int getType()
    {
        return type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Calendar getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate)
    {
        this.creationDate = creationDate;
    }

    public Calendar getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Calendar updateDate) {
        this.updateDate = updateDate;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getOwnerSource()
    {
        return ownerSource;
    }

    public void setOwnerSource(String ownerSource)
    {
        this.ownerSource = ownerSource;
    }

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }
}

