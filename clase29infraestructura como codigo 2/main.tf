provider "aws" {
  region = "us-east-1"
  access_key = ""
  secret_key = ""
}

resource "aws_instance" "ejercicio" {
  ami = "ami-041306c411c38a789"
  instance_type = "t2.micro"
  key_name = "terraform-key"
  security_groups = ["${aws_security_group.allow_rdp.name}"]
  tags = {   Name = "Hola Clase"        }
        
}

resource "aws_security_group" "allow_rdp"  {
   name = "allow_rdp" 
   description = "security group para instancias EC2"

ingress {

 from_port = 3389
 to_port = 3389
 protocol = "tcp"
 cidr_blocks =  ["0.0.0.0/0"]
             }
 

}



  






