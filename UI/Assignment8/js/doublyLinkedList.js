
class Node {
    constructor(element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
    }

    addNode(element) {
        if (element == "") {
            window.alert("Please add some element to be inserted");
        } else {
            var node = new Node(element);
            // if list is empty
            if (linkedlist.head == null) {
                linkedlist.head = node;
                linkedlist.tail = node;
            } else {
                node.prev = linkedlist.tail;
                linkedlist.tail.next = node;
                linkedlist.tail = node;
            }
            displayNode();
        }
    }

    deleteNode(element) {
        var currentNode = linkedlist.head;
        // iterate over the list 
        while (currentNode) {
            if (currentNode.element === element) {
                // if only one element is there
                if (currentNode == linkedlist.head && currentNode == linkedlist.tail) {
                    linkedlist.head = null;
                    linkedlist.tail = null;
                } 
                // if only first element needs to be deleted
                else if (currentNode == linkedlist.head) {
                    linkedlist.head = linkedlist.head.next;
                    linkedlist.head.prev = null;
                } 
                // if last element needs to be deleted
                else if (currentNode == linkedlist.tail) {
                    linkedlist.tail = linkedlist.tail.prev;
                    linkedlist.tail.next = null;
                } 
                // mid element to be deleted
                else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                }
                displayNode();
                return 1;
            }
            currentNode = currentNode.next;
        }
        window.alert("Element not found!");
        return -1;
    }
}
var linkedlist = new DoublyLinkedList();

function addNode() {
    var element = document.getElementById("input").value;
    linkedlist.addNode(element);
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
        document.getElementById("screen").innerHTML += currentNode.element + "<code>--></code>";
        currentNode = currentNode.next;
    }
    document.getElementById("screen").innerHTML += currentNode.element;
    return 1;
} 