<?php

class baseObj {
    public $mysql = null;
    //The table variable must be at least protected so that the sub class can see it.
    protected $table = null;

    public function __construct ()
    {
        $this->mysql = new mysqli("localhost", "user", "password", "database");
        if ($this->mysql->connect_errno) {
            echo "Failed to connect to MySQL: (" . $this->mysql->connect_errno . ") " . $this->mysql->connect_error;
        }
    }

    public function get ($id, $field)
    {
        //Update the query by using the $this->table.
		$query = "SELECT $field FROM $this->table WHERE ID = $id";
        $res = $this->mysql->query($query);
        //Handle the error in case of the query is in valid.
		if (!$res) {			
			return $this->raiseError($query);
		}
		return $res;
    }
	
	//Note: the getAll can invoke the get($id, "*")
    public function getAll ($id)
    {
        //Update the query by using the $this->table.
		$query = "SELECT * FROM $this->tables WHERE ID = $id";
        $res = $this->mysql->query($query);
        //Handle the error in case of the query is in valid.
		if (!$res) {			
			return $this->raiseError($query);
		}
        return $res->fetch_assoc();
    }
	
	protected function raiseError ($query)
	{
		$message  = 'Invalid query: ' . $this->mysql->error . "\n";
		$message .= 'The query: ' . $query;
		//die($message);
		return $message;
	}
}

class propertyData extends baseObj {
    public $id = null;
    public $type = null;
    public $title = null;
    public $address = null;
    public $bedroom = null;
    public $livingroom = null;
    public $diningroom = null;
    protected $hdbblock = null;
    private $swimmingPool = null;

	//Update the access modifier
    protected $table = 'Property';

    public function getType ($ID) { $Type = $this->get( $ID, 'Type'); return $Type; }
    public function getTitle ($ID) { $Title = $this->get( $ID, 'Title') ; return $Type;}
    public function getAddress ($ID) { $Address = $this->get( $ID, 'Address') ; return $Address;}
    public function getBedroom ($ID) { $Bedroom = $this->get( $ID, 'Bedroom') ; return $Bedroom;}
    public function getLivingroom ($ID) { $livingroom = $this->get( $ID, 'Living_room') ; return $livingroom;}
    public function getDiningroom ($ID) { $diningroom = $this->get( $ID, 'Diningroom') ; return $diningroom;}
}

class hdbData extends propertyData {
	//Update the access modifier
    protected $table = 'HDB';
    public function getHDBBlock ($ID) { $this->hdbblock = $this->get($ID, 'HDBBlock'); return $this->hdbblock; }
}

class condoData extends propertyData {
	//Updated the access modifier
    protected $table = 'ConDO';
    public function gotSwimmingPool ($ID)
    {
        return $this->get($ID, 'SwimmingPool');
    }
}