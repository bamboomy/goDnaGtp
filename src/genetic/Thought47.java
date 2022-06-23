package genetic;
import java.util.ArrayList;
class Thought47 extends Thought{
private static ArrayList<Thought47> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 354.17059977984525;
private double fd1 = 380.45036922719555;
private Thought fo0 = null;
private Thought fo1 = null;
Thought47 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought47 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought47 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought47 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought47 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought47 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought47 instance = new Thought47 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    Output.points[5][0] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    lb0 = lb1 || fb0;
    Thought lo2 = Thought79.getInstance(fb1, lb0, lb1, fb0);
if(fo0 != null){
          fb1 = fo0.m2();
}
    fd0 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    fb1 = lb0 || lb1;
    Output.points[5][1] -= fd1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    Output.points[5][2] -= fd0;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[5][3] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought34.getInstance(fd1, fd0, fd1, fd0);
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
    double ld1 = 320.4416873820532;
    Output.points[5][4] -= ld1;
    fd0 = fd1 - ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    boolean lb2 = true;
    Output.points[5][5] += ld1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb2);
}
    Output.points[5][6] += fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb2;
    lb3 = fd1 > ld1;
    ab1 = ab2 && ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 && fb0;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    fb0 = fd0 < fd1;
    double ld1 = 726.225505671688;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    lb0 = ld1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1();
}
    boolean lb2 = false;
    Output.points[5][7] += ad2;
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ad3 < ad4;
    double ld0 = 365.97578576072647;
    Output.points[5][8] += ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb1 = false;
    boolean lb2 = false;
    double ld3 = 784.80674939661;
    Output.points[6][0] -= ad1;
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m1(fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao3.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
        fd0 *= -1;
        }
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
}
    lb0 = ad4 < fd0;
    Output.points[6][1] += fd1;
    boolean lb2 = false;
    ad1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        ab1 = fd1 < fd0;
        } else if (ab2) {
        ab3 = fd1 > fd0;
        Output.points[6][2] -= fd1;
        double ld0 = 450.09532799739236;
        ld0 *= -1;
        ab4 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
        fd1 = ld0 + fd0;
        double ld1 = 549.6447870350671;
if(fo1 != null){
          fo0 = fo1.m4();
}
        boolean lb2 = false;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
        fd0 = fd1 - ld0;
        ld1 = fd0 + fd1;
        ld0 = ld1 - fd0;
        fd1 = ld0 + ld1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        Thought lo3 = Thought80.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1, fb1, lb2, ab1, ab2);
        fd0 = fd1 + ld0;
        ab3 = !ab4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb2, ab1);
}
        ld1 = fd0 + fd1;
        } else {
        if (ab3) {
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m1(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought21.getInstance();
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb1, ab1);
}
    Output.points[6][3] += ad2;
    boolean lb2 = false;
    ad3 *= -1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][4] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
          fo0.m3();
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        double ld0 = 615.6171047812527;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
        Output.points[6][5] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        ld0 = fd0 - fd1;
        Thought lo1 = Thought28.getInstance(ld0, fd0, fd1, ld0);
        fd0 = fd1 - ld0;
        Thought lo2 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
        fb1 = fd1 < ld0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        double ld3 = 939.0653672361946;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 995.2135769203859;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought59.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought49.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, ab1);
    ld0 = fd0 - fd1;
    double ld4 = 162.9321351045581;
if(fo0 != null){
      fo0.m2(ld0, ld4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb5 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo6 = Thought22.getInstance(ld0, ld4, fd0, fd1, fb1, lb1, lb5, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld4, fd0, fd1, fb1, lb1, lb5, ab1);
}
    ld0 = ld4 + fd0;
        fd1 = ld0 - ld4;

Thought.STACK_COUNTER++;
return ab2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
        double ld1 = 996.5388148366739;
    lb0 = fb0 && fb1;
    Thought lo2 = Thought11.getInstance(ld1, ad1, ad2, ad3);
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    lb0 = lb3 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb3, fb0);
}
if(fo0 != null){
      fo0.m2();
}
    fb1 = lb0 || lb3;
    fb0 = fb1 || lb0;
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ad2 > ad3;
    ab1 = ad4 < fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld1 = 897.4205477962068;
        ab1 = !ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      ab4 = fo0.m2(fb0, fb1, lb0, ab1);
}
    ld1 = ad1 - ad2;
    ab2 = ad3 > ad4;

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 673.5219003364836;
    Output.points[6][6] += fd0;
        fb0 = fd1 < ld0;
    boolean lb1 = false;
    fd0 *= -1;
if(ao4 != null){
      fb0 = ao4.m2(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    lb1 = ld0 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    double ld2 = 335.0499288212963;
        lb1 = fb0 && fb1;
    ld2 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld0, ld2, fd0, fd1);
}
    ld0 = ld2 - fd0;
    lb1 = fd1 > ld0;
    fb0 = ld2 < fd0;
    fd1 = ld0 + ld2;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought50.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao2 != null){
      ao2.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    Thought lo1 = Thought21.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    Thought lo2 = Thought74.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    if (fb1) {
        fb0 = fb1 && fb0;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ab2 && ab3;
        fd1 = fd0 + fd1;
    ab4 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
        ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought95.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    Thought lo2 = Thought7.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
    boolean lb3 = true;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    lb0 = !lb3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    fd0 = fd1 + fd0;
    Output.points[6][7] += fd1;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb1 = ad1 < ad2;
    Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m1(ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
    Thought lo2 = Thought16.getInstance(ao4, fo0, fo1, ao1);

Thought.STACK_COUNTER++;
return ab3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][8] += fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        lb0 = fd0 < fd1;
        fb0 = fb1 || lb0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
        lb0 = fd0 > fd1;
        fb0 = fb1 && lb0;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fb1 || lb0;
        double ld1 = 268.3884559072407;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 581.0799001228165;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought41.getInstance(ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;
    fd0 = fd1 + ld0;
    ab2 = !ab3;
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ld0 + fd0;
    boolean lb2 = true;
    ab4 = fd1 > ld0;
    fd0 = fd1 + ld0;
    fb0 = fd0 < fd1;
    Thought lo3 = Thought88.getInstance(fo1, fo0, fo1, fo0, fb1, lb2, ab1, ab2);
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0);
}
    boolean lb4 = true;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fo0.m2(ab3, ab4, fb0, fb1);
}
    lb2 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb4 = fd0 < fd1;
    Thought lo5 = Thought92.getInstance(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < ad1;
    double ld0 = 503.00312185640934;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought9.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    Thought lo2 = Thought15.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fb0 = fo1.m2();
}
    ad2 *= -1;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ad1 = ad2 - ad3;
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought21.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
    ad3 *= -1;
    ab2 = ab3 && ab4;
    boolean lb1 = false;

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought49.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 *= -1;
    double ld1 = 123.94400678836863;
        ld1 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
    fd0 = fd1 - ld1;
    Output.points[7][0] -= fd0;
    fd1 = ld1 - fd0;
    fd1 = ld1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return ld1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought5.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
    fb0 = fd1 < ad1;
    fb1 = ad2 < ad3;
    Thought lo1 = Thought62.getInstance(ad4, fd0, fd1, ad1);
    boolean lb2 = false;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao3 != null){
      lb2 = ao3.m2(fb0, fb1, lb2, fb0);
}
    fb1 = fd1 < ad1;
    double ld3 = 109.79176367346686;
if(ao4 != null){
      ao4.m2();
}
    Output.points[7][1] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    boolean lb4 = false;

Thought.STACK_COUNTER++;
return ld3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought90.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
          ab2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        double ld1 = 41.17976197915245;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + ld1;
        boolean lb2 = false;
        ab4 = fd0 > fd1;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4(lb2, ab1, ab2, ab3);
}
if(ao2 != null){
          ao2.m1();
}
if(ao4 != null){
          ao3 = ao4.m4(ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb2);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        ab1 = fd1 < ld1;
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
    ab3 = ab4 && fb0;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    fb0 = ad1 < ad2;
    fb1 = lb0 || ab1;
    ab2 = ad3 > ad4;
    boolean lb1 = true;
    Thought lo2 = Thought96.getInstance(ab2, ab3, ab4, fb0);
    fb1 = !lb0;
    fd0 = fd1 + ad1;
if(ao1 != null){
      ao1.m2();
}
    lb1 = !ab1;
    boolean lb3 = true;
    boolean lb4 = true;
    Thought lo5 = Thought6.getInstance(ad2, ad3, ad4, fd0, lb4, ab1, ab2, ab3);
    Output.points[7][2] += fd1;

Thought.STACK_COUNTER++;
return ad1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    if (fb0) {
        boolean lb1 = true;
        Thought lo2 = Thought15.getInstance(fo1, fo0, fo1, fo0);
        fd1 *= -1;
        fd0 = fd1 + fd0;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb1);
}
        Thought lo4 = Thought83.getInstance(fo1, fo0, fo1, fo0, lb3, lb0, fb0, fb1);
        boolean lb5 = false;
        boolean lb6 = false;
        fd1 = fd0 - fd1;
        lb1 = lb3 && lb5;
if(fo1 != null){
          fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
        if (lb6) {
            fd1 *= -1;
            fd0 = fd1 - fd0;
            lb0 = fb0 && fb1;
            double ld7 = 278.15034665470296;
            lb1 = lb3 && lb5;
            boolean lb8 = false;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld7, fd0);
}
if(fo1 != null){
              fo0 = fo1.m4(lb5, lb6, lb0, fb0);
}
            boolean lb9 = false;
            Output.points[7][3] -= fd1;
            fb0 = ld7 < fd0;
            double ld10 = 341.77324004192457;
}}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought72.getInstance(fo0, fo1, fo0, fo1);
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    double ld3 = 607.5200441728873;
    boolean lb4 = true;
    lb2 = lb4 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld3 - fd0;
    double ld5 = 866.0513022080333;
    fd0 = fd1 + ld3;
    if (fb1) {
        lb0 = !lb2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, ab1, ab2, ab3);
}
        boolean lb6 = false;
        ld5 = fd0 - fd1;
if(fo0 != null){
          ld3 = fo0.m3(ld5, fd0, fd1, ld3);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld5, fd0, fd1, ld3);
}
        ld5 = fd0 - fd1;
        ld3 = ld5 + fd0;
if(fo0 != null){
          fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        boolean lb7 = false;
        Output.points[7][4] -= fd1;
        lb6 = !lb7;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
        ad3 *= -1;
    double ld0 = 704.2100968501616;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    double ld1 = 937.8579019337728;
    ad2 = ad3 - ad4;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb0, fb1, fb0, fb1);
}
    double ld2 = 373.72354542732455;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 - fd1;
    double ld3 = 654.4138306108347;
    Output.points[7][5] += ld0;
    fb1 = ld1 > ld2;
    Thought lo4 = Thought33.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    ld3 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld2, ld3, ad1);
}
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab2 = ab3 || ab4;
    boolean lb0 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    ab4 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, lb0, ab1);
}
    double ld1 = 238.4157634559965;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    ab1 = !ab2;
    if (ab3) {
        ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, lb0, lb2, ab1, ab2);
}
        ab3 = ab4 && fb0;
        fb1 = ad3 > ad4;
        fd0 = fd1 + ld1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, lb0, lb2, ab1, ab2);
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
            fd1 = ld1 + ad1;
            double ld3 = 929.5626622427206;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
}}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    Output.points[7][6] += fd0;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(ao1 != null){
      ao1.m3(lb1, fb0, fb1, lb0);
}
if(ao2 != null){
      lb1 = ao2.m2();
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, lb0, lb1, fb0);
}
    fb1 = ad3 < ad4;
    Thought lo2 = Thought27.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
    lb0 = fd0 > fd1;
    lb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    boolean lb3 = true;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4(lb1, lb3, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao2.m3();
}

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought70.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    Thought lo2 = Thought23.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
    double ld3 = 60.15708206790162;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld3, fd0, fd1);
}
    fb0 = ld3 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld3, fd0, fd1, ld3);
}
    Thought lo4 = Thought67.getInstance(fb1, lb1, ab1, ab2);
    boolean lb5 = true;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1();
}
    ad2 *= -1;
    ab2 = ab3 || ab4;
    if (fb0) {
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
        ad1 = ad2 - ad3;
if(fo0 != null){
          ab4 = fo0.m2(fo1, ao1, ao2, ao3);
}
        } else if (fb0) {
        ad4 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        fd0 *= -1;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        Output.points[7][7] += fd1;
        boolean lb0 = true;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 || lb0;
        boolean lb1 = false;
        ad1 *= -1;
        ad2 *= -1;
        boolean lb2 = false;
        lb1 = ad3 > ad4;
}
Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 + fd1;
            Thought lo0 = Thought25.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Output.points[7][8] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    Output.points[8][0] -= fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought99.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    double ld1 = 322.84898764975867;
if(fo0 != null){
          fo0.m3(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought36.getInstance();
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo3 = Thought6.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    Output.points[8][1] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        boolean lb4 = false;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Output.points[8][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[8][3] -= fd0;
    fb0 = !fb1;
    Thought lo0 = Thought3.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    fb1 = !fb0;
    fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = fd0 < fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[8][4] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fd1 = fd0 - fd1;
    double ld2 = 84.97894469817261;
    double ld3 = 816.8567471337625;
    Output.points[8][5] -= ld2;
    ld3 *= -1;
    fb0 = fd0 < fd1;
    Thought lo4 = Thought14.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld3, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo5 = Thought82.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
