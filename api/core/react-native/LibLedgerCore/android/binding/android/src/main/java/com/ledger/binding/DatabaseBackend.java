// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from database.djinni

package co.ledger.core;

import java.util.concurrent.atomic.AtomicBoolean;

/**Class representing a database */
public abstract class DatabaseBackend {
    /**
     *Set database's user name
     *@param username, string
     *@return DatabaseBackend object, databse with user name set
     */
    public abstract DatabaseBackend setUsername(String username);

    /**
     *Set database's password
     *@param password, string
     *@return DatabaseBackend object, database with password set
     */
    public abstract DatabaseBackend setPassword(String pwd);

    /**
     *Set database's host which storing database
     *@param host, string
     *@return DatabaseBackend object, database with host set
     */
    public abstract DatabaseBackend setHost(String host);

    /**
     *Set database's host's address
     *@param hostAddr, string, host's address
     *@return DatabaseBackend object, database with host's address set
     */
    public abstract DatabaseBackend setHostAddr(String hostAddr);

    /**
     *Set database's port on which it connects to host
     *@param port, string
     *@return DatabaseBackend object, database with port set
     */
    public abstract DatabaseBackend setPort(String port);

    /**
     *Set database's specific options
     *@param opts, string
     *@return DatabaseBackend object, database with options set
     */
    public abstract DatabaseBackend setOptions(String opts);

    /**
     *Set database's mode (SSL) of security interaction of type databse/server
     *@param mode, string
     *@return DatabaseBackend object, database with mode set
     */
    public abstract DatabaseBackend setSslMode(String mode);

    /**
     *Set database's Kerberos name used to secure (authentication) user/databse interaction
     *@param name, string
     *@return DatabaseBackend object, database with Kerberos name set
     */
    public abstract DatabaseBackend setKerberosName(String name);

    /**TODO */
    public abstract DatabaseBackend setService(String service);

    public abstract DatabaseBackend setConnectionPoolSize(int size);

    public abstract DatabaseBackend enableQueryLogging(boolean enable);

    /**
     *Return database's name
     *@return string
     */
    public abstract String getUsername();

    /**
     *Return database's password
     *@return string
     */
    public abstract String getPassword();

    /**
     *Return database's host
     *@return string
     */
    public abstract String getHost();

    /**
     *Return database's host's address
     *@return string
     */
    public abstract String getHostAddr();

    /**
     *Return database's port
     *@return string
     */
    public abstract String getPort();

    /**
     *Return database's options
     *@return string
     */
    public abstract String getOptions();

    /**
     *Return database's SSL mode
     *@return string
     */
    public abstract String getSslMode();

    /**
     *Return database's Kerberos name
     *@return string
     */
    public abstract String getKerberosName();

    /**TODO */
    public abstract String getService();

    public abstract int getConnectionPoolSize();

    public abstract boolean isLoggingEnabled();

    /**
     *Create an instance of SQLite3 database
     *@return DatabaseBackend object
     */
    public static native DatabaseBackend getSqlite3Backend();

    /**
     *Create an instance of PostgreSQL database
     *@return DatabaseBackend object
     */
    public static native DatabaseBackend getPostgreSQLBackend();

    private static final class CppProxy extends DatabaseBackend
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            destroy();
            super.finalize();
        }

        @Override
        public DatabaseBackend setUsername(String username)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setUsername(this.nativeRef, username);
        }
        private native DatabaseBackend native_setUsername(long _nativeRef, String username);

        @Override
        public DatabaseBackend setPassword(String pwd)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setPassword(this.nativeRef, pwd);
        }
        private native DatabaseBackend native_setPassword(long _nativeRef, String pwd);

        @Override
        public DatabaseBackend setHost(String host)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setHost(this.nativeRef, host);
        }
        private native DatabaseBackend native_setHost(long _nativeRef, String host);

        @Override
        public DatabaseBackend setHostAddr(String hostAddr)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setHostAddr(this.nativeRef, hostAddr);
        }
        private native DatabaseBackend native_setHostAddr(long _nativeRef, String hostAddr);

        @Override
        public DatabaseBackend setPort(String port)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setPort(this.nativeRef, port);
        }
        private native DatabaseBackend native_setPort(long _nativeRef, String port);

        @Override
        public DatabaseBackend setOptions(String opts)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setOptions(this.nativeRef, opts);
        }
        private native DatabaseBackend native_setOptions(long _nativeRef, String opts);

        @Override
        public DatabaseBackend setSslMode(String mode)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setSslMode(this.nativeRef, mode);
        }
        private native DatabaseBackend native_setSslMode(long _nativeRef, String mode);

        @Override
        public DatabaseBackend setKerberosName(String name)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setKerberosName(this.nativeRef, name);
        }
        private native DatabaseBackend native_setKerberosName(long _nativeRef, String name);

        @Override
        public DatabaseBackend setService(String service)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setService(this.nativeRef, service);
        }
        private native DatabaseBackend native_setService(long _nativeRef, String service);

        @Override
        public DatabaseBackend setConnectionPoolSize(int size)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_setConnectionPoolSize(this.nativeRef, size);
        }
        private native DatabaseBackend native_setConnectionPoolSize(long _nativeRef, int size);

        @Override
        public DatabaseBackend enableQueryLogging(boolean enable)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_enableQueryLogging(this.nativeRef, enable);
        }
        private native DatabaseBackend native_enableQueryLogging(long _nativeRef, boolean enable);

        @Override
        public String getUsername()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getUsername(this.nativeRef);
        }
        private native String native_getUsername(long _nativeRef);

        @Override
        public String getPassword()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getPassword(this.nativeRef);
        }
        private native String native_getPassword(long _nativeRef);

        @Override
        public String getHost()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getHost(this.nativeRef);
        }
        private native String native_getHost(long _nativeRef);

        @Override
        public String getHostAddr()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getHostAddr(this.nativeRef);
        }
        private native String native_getHostAddr(long _nativeRef);

        @Override
        public String getPort()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getPort(this.nativeRef);
        }
        private native String native_getPort(long _nativeRef);

        @Override
        public String getOptions()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getOptions(this.nativeRef);
        }
        private native String native_getOptions(long _nativeRef);

        @Override
        public String getSslMode()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getSslMode(this.nativeRef);
        }
        private native String native_getSslMode(long _nativeRef);

        @Override
        public String getKerberosName()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getKerberosName(this.nativeRef);
        }
        private native String native_getKerberosName(long _nativeRef);

        @Override
        public String getService()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getService(this.nativeRef);
        }
        private native String native_getService(long _nativeRef);

        @Override
        public int getConnectionPoolSize()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getConnectionPoolSize(this.nativeRef);
        }
        private native int native_getConnectionPoolSize(long _nativeRef);

        @Override
        public boolean isLoggingEnabled()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_isLoggingEnabled(this.nativeRef);
        }
        private native boolean native_isLoggingEnabled(long _nativeRef);
    }
}