const qualifiedNameSeparator = '::';

export function getQualifiedName(elementId: String) {
  let node = document.querySelector("[data-treeitemid='" + elementId + "']");
  let nodeLabel = node.getAttribute('data-treeitemlabel');
  let rootUlElement = findRootUl(node, 0);
  if (rootUlElement == undefined) {
    if (nodeLabel == undefined) return '';
    else return nodeLabel.replace(/«.*?»/g, '').replace(/%20|\s+/g, ''); // removes stereotypes
  } else {
    let semanticDiv = rootUlElement.parentElement.querySelector("[data-treeitemkind*='siriusComponents://semantic']");
    if (semanticDiv != undefined) {
      return (
        getQualifiedName(semanticDiv.getAttribute('data-treeitemid')) +
        qualifiedNameSeparator +
        nodeLabel.replace(/«.*?»/g, '').replace(/%20|\s+/g, '')
      ); //removes stereotypes from labels
    } else {
      return '';
    }
  }
}

export function findParentWithAttribute(element, attributeName, attributeValue) {
  const parent = element.parentNode;
  if (!parent) return null;
  if (parent.getAttribute(attributeName) === attributeValue) {
    return parent;
  } else {
    return findParentWithAttribute(parent, attributeName, attributeValue);
  }
}

function findRootUl(element, ulIndex) {
  const parent = element.parentElement;
  if (!parent) return null;
  if (parent instanceof HTMLUListElement || parent instanceof HTMLLIElement) {
    let elementChildren = Array.from(parent.parentElement.children);
    let semanticDiv = null;
    elementChildren.forEach((child) => {
      if (child instanceof HTMLDivElement) {
        semanticDiv = child.querySelector("[data-treeitemkind*='siriusComponents://semantic']");
      }
    });
    if (semanticDiv != undefined) return parent;
    else return findRootUl(parent, ulIndex + 1);
  } else {
    return findRootUl(parent, ulIndex);
  }
}

export function getDocumentId(elementId: String) {
  let node = document.querySelector("[data-treeitemid='" + elementId + "']");
  let treeRootElements = findParentWithAttribute(node, 'data-testid', 'tree-root-elements');
  const docTrees = [...treeRootElements.children]; // querySelectorAll("> *");
  let returnedDocument = '';
  docTrees.forEach((docTree) => {
    const selectedElement = docTree.querySelector("[data-treeitemid='" + elementId + "']");
    if (selectedElement != undefined) {
      let selectedDocument = docTree.querySelector("[data-treeitemkind='siriusWeb://document']");
      returnedDocument = selectedDocument.getAttribute('data-treeitemid');
      return;
    }
  });
  return returnedDocument;
}
