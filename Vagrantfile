# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|

  config.vm.box = "pcf-immersion-box"
  #config.vm.box_url = "https://s3-us-west-2.amazonaws.com/pcf-immersion/pcf-immersion-ubuntu-14.04.1-amd64.box"

  config.vm.provider "virtualbox" do |vb|
     vb.gui = true
  #
  #   # Use VBoxManage to customize the VM. For example to change memory:
  #   vb.customize ["modifyvm", :id, "--memory", "1024"]
  end
  #
end
