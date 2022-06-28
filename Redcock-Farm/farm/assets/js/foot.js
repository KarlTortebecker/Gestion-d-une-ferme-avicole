var div = document.createElement('div');
div.innerHTML = "<"+
				"d"+
				"i"+
				"v"+
				">"+
				"C"+
				"o"+
				"p"+
				"y"+
				"r"+
				"i"+
				"g"+
				"h"+
				"t"+
				" "+
				"©"+
				" "+
				"2"+
				"0"+
				"2"+
				"2"+
				" "+
				
				"F"+
				"o"+
				"o"+
				"t"+
				"e"+
				"r"+
				""+
				"<"+
				"/"+
				"d"+
				"i"+
				"v"+
				">";

// set style
div.style.color = 'rgb(156 159 166)';
div.style.float = 'left';
div.style.position = 'fixed';
div.style.bottom = '0';
div.style.left = '0';
div.style.right = '0';
div.style.padding = '10px';
div.style.background = '#fff';
div.style.textAlign = 'center';

// better to use CSS though - just set class
div.setAttribute('class', ''); // and make sure myclass has some styles in css
document.body.appendChild(div);
