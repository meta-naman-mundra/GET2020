class Node {
    constructor(value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    addNode(inputValue) {
        if (inputValue == "") {
            alert("Please enter some value to be inserted");
        } else {
            //node to be added
            var node = new Node(inputValue);
            // to store current Node  
            // if list is Empty add the element and make it head 
            if (linkedlist.head == null) {
                linkedlist.head = node;
            } else {
                var currentNode = linkedlist.head;
                // iterate to the end of the list 
                while (currentNode.next) {
                    currentNode = currentNode.next;
                }
                // add node 
                currentNode.next = node;
            }
            displayNode();
            linkedlist.size++;
        }
    }

    deleteNode(element) {
        var currentNode = linkedlist.head;
        var previousNode = null;
        while (currentNode != null) {
            // comparing element with currentNode data if found then remove     
            if (currentNode.data === element) {
                if (previousNode == null) {
                    linkedlist.head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
                linkedlist.size--;
                displayNode();
                return 1;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        window.alert("Element not found!");
        return -1;
    }
}
var linkedlist = new LinkedList();
function addNode() {
    var inputValue = document.getElementById("input").value;
    linkedlist.addNode(inputValue);
}

function deleteNode() {
    var element = document.getElementById('input').value;
    linkedlist.deleteNode(element);
}

function displayNode() {
    document.getElementById("screen").innerHTML = "";
    if (linkedlist.head == null) {
        document.getElementById("showList").style.display = "none";
        return -1;
    }
    document.getElementById("showList").style.display = "block";
    var currentNode = linkedlist.head;
    while (currentNode.next) {
        document.getElementById("screen").innerHTML += currentNode.data + "<code>--></code>";
        currentNode = currentNode.next;
    }
    document.getElementById("screen").innerHTML += currentNode.data + "<code>-->&#x25BC</code>";
    return 1;
}  